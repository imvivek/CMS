'use strict';

angular.module('Authentication')

.factory('AuthenticationService',['$http','$rootScope',
		 function($http,$rootScope){
			var service={};
			service.Login = function(userrole,username,password,callback){
			 $http.post('http://localhost:8080/CMS/login/')
			 	.success(function(response){
				 callback(response);
			 });
		};
}]);