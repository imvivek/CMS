'use strict';

// declare modules

angular.module('Authentication', []);
angular.module('Home', []);

angular
		.module('BasicHttpAuthExample',
				[ 'Authentication', 'Home', 'ngRoute', 'ngCookies' ])
				
		.config([ '$routeProvider', function($routeProvider) {
			$routeProvider
			.when('/home', {
				controller : 'LoginController',
				templateUrl : 'app/views/home.html'
			})
			
			.when('/admin', {
//				controller : 'LoginController',
				templateUrl : 'app/views/adminHome.html'
			})
			
			.when('/local', {
//				controller : 'LoginController',
				templateUrl : 'app/views/localHome.html'
			})
			
			
			.when('/', {
				controller : 'LoginController',
				templateUrl : 'app/views/userlogin.html'
			})
			.otherwise({
				redirectTo : '/userlogin'
			});
			
//			$locationProvider.html5Mode(true);
		} ]);//

//		.run(
//				['$rootScope','$location','$http','$cookieStore',
//						function($rootScope, $location, $http, $cookieStore) {
//							// Keep user logged in after page refresh
//							$rootScope.globals = $cookieStore.get('globals')|| {};
//							if ($rootScope.globals.currentUser) {
//								$http.defaults.headers.common['Authorization'] = 'Basic'+$rootScope.globals.currentUser.authdata;
//							}
//							
//							$rootScope.$on('$locationChangeStart', function (event, next, current) {
//					            // redirect to login page if not logged in
//					            if ($location.path() !== '/login' && !$rootScope.globals.currentUser) {
//					                $location.path('/login');
//					            }
//					        });
//						} ]);

