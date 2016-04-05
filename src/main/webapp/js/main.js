(function () {
	'use strict';

	var main = angular.module('main', [
		'ngRoute'
		])
	.config(configure);

	configure.$inject = ['$routeProvider'];
	function configure ($routeProvider) {
		$routeProvider.
			when('/movies', {
				templateUrl: 'templates/movies.html',
				controller: 'MoviesCtrl'
			})
			.when('/rating&user', {
				templateUrl: 'templates/rating.html',
				controller: 'RatingCtrl'
			})
			.otherwise({
				redirectTo: '/movies'
			  });
	}

	main.controller('MoviesCtrl', function ($scope, $http) {
		var baseUrl = '/movie';

		$scope.getMovies = function (rating) {
				$http.get(baseUrl)
					.success( function (data) {
						$scope.movies = data;
					});
		}

		$scope.getMoviesRating = function (rating) {
				$http.get(baseUrl + '/rating', {
					params: {
						rating: rating
					}
				})
				.success( function (data) {
					$scope.moviesRating = data;
				});
		}

		$scope.addMovie = function () {
				var movie = { "title":"Deadscspool","director":"Tim Milller" };

				$http.post(baseUrl, movie).success( function (data) {
					$scope.getMovies();
			});
		}

		$scope.delMovie = function (id) {
				$http.delete(baseUrl + '/' + id).success( function (data) {
					$scope.getMovies();
			});
		}

		$scope.getMovies();

	});

	main.controller('RatingCtrl', function ($scope, $http) {
		var baseUrl = '/rating';
		$scope.ratingShow = true;

		$scope.getRatingExtend = function () {
				$http.get(baseUrl + '/extend')
					.success( function (data) {
						$scope.ratingExtend = data;
					});
		}

		$scope.getRatingLess = function () {
				$http.get(baseUrl + '/less')
					.success( function (data) {
						$scope.ratingLess = data;
					});
		}


		$scope.getRatingDate = function () {
				$http.get(baseUrl + '/date')
					.success( function (data) {
						$scope.rating = data;
					});
		}

		$scope.getRating = function () {
				$http.get(baseUrl)
					.success( function (data) {
						$scope.rating = data;
					});
		}

		$scope.getUsers= function () {
				$http.get('/user')
					.success( function (data) {
						$scope.users = data;
					});
		}

		$scope.getRating();

	});

})();
