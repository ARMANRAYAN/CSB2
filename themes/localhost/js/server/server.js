//afMarket = afMarket || {}
MetronicApp.factory("CustomerService", function () {
    var customers = [
        {
            id:0,
            name:"سجاد صفائیان",
            mobile:"09123489283",
            email:"safairon@gmail.com",
            score:30,
            nationalCode:1231231233,
            mentorCustomerId:1
        } ,
        {
            id:1,
            name:"فرزاد عباسی",
            mobile:"09123489283",
            email:"safairon@gmail.com",
            score:50,
            nationalCode:8763948573
        },
        {
            id:2,
            name:"مجتبی صفائیان",
            mobile:"09123437888",
            email:"mjsafa@gmail.com",
            score:0,
            nationalCode:0984578765
        },
        {
            id:3,
            name:"حسین امیری",
            mobile:"09238443477",
            email:"test@gmail.com",
            score:0,
            nationalCode:6204876357
        },
        {
            id:4,
            name:"علی تهرانی",
            mobile:"09238443477",
            email:"ali@gmail.com",
            score:0,
            nationalCode:6204876357,
            mentorCustomerId:1
        }


    ];
    for (var i = 0; i < 50; i++) {
        /*customers.push({
         id:i, name:"name " + i, description:"description " + i
         });*/
    }


    return {
        lastId:10,
        search:function (filter) {
            return customers;
        },
        total:function () {
            return customers.length;
        },
        getById:function (customerId) {
            var customer = {};
            angular.forEach(customers, function (value) {
                if (value.id == customerId) {
                    customer = value;
                }
            });

            if (customer.id != undefined) {
                return customer;
            } else {
                return;
            }

        },

        findInvitees:function (customerId) {
            var invitees = [];

            angular.forEach(customers, function (value) {
                if (value.mentorCustomerId == customerId) {
                    invitees.push(value);
                }
            });
            return invitees;
        },

        deleteInvitee:function (customer, invitee) {
            var invitees = [];
            angular.forEach(customer.invitees, function (value) {
                if (value.id != invitee.id) {
                    invitees.push(value);
                } else {
                    value.mentorCustomerId = undefined;
                    value.mentorCustomer = undefined;
                }
            });

            angular.forEach(customers, function (value) {
                if (value.id == invitee.id) {
                    value.mentorCustomerId = undefined;
                    value.mentorCustomer = undefined;
                }
            });
            customer.invitees = invitees;
        },

        addInvitee:function (customer, invitee) {
            angular.forEach(customers, function (value) {
                if (value.id == customer.id) {
                    value.invitees.push(invitee);
                } else if (value.id == invitee.id) {
                    value.mentorCustomerId = customer.id;
                    value.mentorCustomer = customer;
                }
            });
        },
        getMentors:function (customerId) {
            var _customers = [];
            var that = this;
            angular.forEach(customers, function (customerItem) {
                if (customerItem.id == customerId) {
                    var i = 0;
                    var mentorCustomer = that.getById(customerItem.mentorCustomerId);
                    while (i < 11 && mentorCustomer) {
                        _customers.push(mentorCustomer);
                        mentorCustomer = that.getById(mentorCustomer.mentorCustomerId);
                        i++;
                    }
                }
            });
            return _customers;
        }
    };
});


MetronicApp.factory("ScoreService", ['CustomerService', function (CustomerService) {
    var scores = [
        {
            customerId:0,
            value:10,
            date:new Date('2014-01-17')
        },
        {
            customerId:0,
            value:20,
            date:new Date('2014-01-16')
        },
        {
            customerId:1,
            value:18,
            date:new Date('2014-12-15')
        },
        {
            customerId:1,
            value:21,
            date:new Date('2014-12-16')
        },
        {
            customerId:1,
            value:11,
            date:new Date('2014-12-17')
        }
    ];

    return {
        addScore:function (customer, score) {
            score = parseInt(score);
            customer.score += score;
            scores.push({customerId:customer.id, value:score, date:new Date()});

            var _customers = CustomerService.getMentors(customer.id);
            angular.forEach(_customers, function (_customer) {
                _customer.score += score;
                scores.push({customerId:_customer.id, value:score, date:new Date()});
            });
        },


        findByCustomerId:function (customerId) {
            var _scores = [];
            angular.forEach(scores, function (score) {
                if (score.customerId == customerId) {
                    _scores.push(score);
                }
            });
            return _scores;
        },


        //extract score data by date
        chartData:function (customerId) {
            var data = {"cols":[
                {id:"t", label:"Topping", type:"string"},
                {id:"s", label:"امتیازات", type:"number"}
            ]};


            var rows = [];
            var _scores = this.findByCustomerId(customerId);

            angular.forEach(_scores, function (score) {
                var row = {};
                row.c = [];
                row.c.push({v:score.date.getDate()});
                row.c.push({v:score.value});

                rows.push(row);
            });

            data.rows = rows
            return data;
        }
    };

}]);


//Users Service
MetronicApp.factory("UserService", function (JsonServer) {
    return {
        addUser: function(user){
            return JsonServer.postByUrl('/csb-modules-service-portlet.myuser', 'new-user',{user: JSON.stringify(user)}, {});
        }

    };

});


//Users Service
MetronicApp.factory("JsonServer", function ($http) {
    var baseUrl = '/api/jsonws';

    return {
        postByUrl:function (url, method, params, options) {

            var _url = baseUrl + url;
            var urlParams = '';

            var data = {
                "method":method,
                "params":params,
                "jsonrpc":"2.0"
            };

            var dataStr = JSON.stringify(data);

            /*
             var _success = function(res){
             app.loading.end(options.loadingKey);
             app.loader.ready(url);
             options.success(res);
             };
             */

            /*
             var _error = function(res){
             app.loading.end(options.loadingKey);
             app.loader.ready(url);
             options.error(res);
             };
             */

            //params.p_auth = authToken;


            /*
             $.ajax({
             type:'POST',
             url:url,
             data: dataStr,
             success: _success,
             error: _error,
             contentType: 'application/json'
             });
             */

            $http.post(_url, dataStr ).
                success(
                function (data, status, headers, config) {
                    // this callback will be called asynchronously
                    // when the response is available
                    return data;
                }).
                error(function (data, status, headers, config) {
                    // called asynchronously if an error occurs
                    // or server returns response with an error status.
                });

            return;
        }
    };

});