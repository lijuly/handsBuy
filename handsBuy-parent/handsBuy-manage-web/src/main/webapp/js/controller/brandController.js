/**
 * 品牌管理控制层
 */

app.controller('brandController' ,function($scope, $controller, brandService){

    $controller('baseController',{$scope:$scope});//继承

    // 读取列表数据绑定到表单中
    $scope.findAll=function(){
        brandService.findAll().success(function(response){
            $scope.list=response;
        });
    }

    // 分页
    $scope.findAllByPage = function(page, pageSize){
        brandService.findAllByPage(page, pageSize).success(
            function (response) {
                $scope.list=response.list;
                $scope.paginationConf.totalItems=response.total
            }
        );
    }

    // 修改
    $scope.update = function (entity) {
        $scope.entity = entity;
    }

    // 添加或者修改
    $scope.save = function () {
        var methodName="addBrand.do"
        if ($scope.entity.id != null) {
            var methodName="updateBrand.do"
        }
        brandService.save(methodName, $scope.entity).success(function (response) {
            if (response.success) {
                alert(response.message)
                $scope.reloadList();//重新加载
            } else {
                alert(response.message);
            }
        });
    }

    $scope.delete = function () {
        //获取选中的复选框
        brandService.delete($scope.selectIds).success(
            function (response) {
                if (response.success) {
                    alert(response.message)
                    $scope.reloadList();//刷新列表
                } else {
                    alert(response.message)
                }
            })
    }





});