/**
 * 品牌管理控制层
 */

app.controller('specificationController' ,function($scope, $controller, specificationService){

    $controller('baseController',{$scope:$scope});//继承

    // 读取列表数据绑定到表单中
    $scope.findAll=function(){
        specificationService.findAll().success(function(response){
            $scope.list=response;
        });
    }

    // 分页
    $scope.findAllByPage = function(page, pageSize){
        specificationService.findAllByPage(page, pageSize).success(
            function (response) {
                $scope.list=response.list;
                $scope.paginationConf.totalItems=response.total
            }
        );
    }

    // 修改
    $scope.update = function (entity) {
        specificationService.findOptionAll(entity.id).success(
            function (response) {
                $scope.optionList = response;
                $scope.specName=entity.specName;
        });
    }
});