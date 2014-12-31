function Hello($scope, $http) {
	$http.get('http://localhost:8080/Book/1').
		success(function(data) {
			$scope.book = data;
		});
}