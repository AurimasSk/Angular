app.controller('ItemsController', ['$scope', function($scope) { 
  $scope.title = 'Hello angular';
  $scope.x.Name = 'Name1'
  $scope.x = [
                 { Name: 'text1' },
                 { text: 'text2' },
                 { text: 'text3' }
             ]
}]);