app.controller('ItemsController', ['$scope', function($scope) { 
  $scope.title = 'Hello angular';
  $scope.items = [
                 { name: "text1", descr: "Descr1" },
                 { name: "text2", descr: "Descr2" },
                 { name: "text3", descr: "Descr3" }
             ]
}]);

app.controller('FormCtrl', ['$scope', function($scope) {
	var item = {id:null, title:'', price:'', itemType:'', description:'', boughTime:null}
	
	$scope.submitForm = function() {
		console.log("Submitting form with data: ");
		console.log("Title: " + $scope.item.title);
	}
}]);