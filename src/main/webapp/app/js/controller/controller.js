'use strict';

angular.module('Authentication')
	.controller('LoginController',[
	     '$scope','$rootScope','$location','$http','AuthenticationService',
	     function($scope, $rootScope, $location,$http, AuthenticationService){
	    	/* AuthenticationService.ClearCredentials();*/
	    	 
	    	 $scope.login = function(){
	    		 $scope.dataLoading= true;
	    		 
	    		 $http.get('http://localhost:8080/CMS/login/'+$scope.userrole+'/'+ $scope.username+'/'+$scope.password)
				 	.success(function(data){
				 		if(data.status=="SUCCESS"){
	    				 $location.path('/');	    				 
	    			 }
				 		
				 		if(data.status=="ERROR"){
				 			$scope.error = data.message;
				 			$location.path('/home');
				 		}
				 	})	
	    			 .error(function(data){
	    				 $scope.error = data.message;
	    				 $scope.dataLoading = false;
	    			 });
				 };
	     
	    		 
//    		 AuthenticationService.Login($scope.userrole, $scope.username, $scope.password, function(response){
//	    			 if(response.success){
////	    				 AuthenticationService.SetCredentials($scope.userrole, $scope.username, $scope.password);
//	    				 $location.path('/');	    				 
//	    			 }
//	    			 else{
//	    				 $scope.error = response.message;
//	    				 $scope.dataLoading = false;
//	    			 }
//	    		 });
	    		 
	    		 console.log($scope.username +","+ $scope.password);
	    		 
	    	 
	     }]);
