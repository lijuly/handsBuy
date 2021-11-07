/**
 * 父控制器
 */

app.controller('baseController' ,function($scope){

    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 10,
        perPageOptions: [10, 20, 30, 40, 50],
        onChange: function(){
            $scope.reloadList();//重新加载
        }
    };

    //重新加载列表 数据
    $scope.reloadList = function () {
        //切换页码
        $scope.findAllByPage($scope.paginationConf.currentPage,
            $scope.paginationConf.itemsPerPage);
    }

    $scope.selectIds=[];//选中的ID集合
    //更新复选
    $scope.updateSelection = function($event, id) {
        //如果是被选中,则增加到数组
        if($event.target.checked){
            $scope.selectIds.push(id);
        } else {
            var idx = $scope.selectIds.indexOf(id);
            $scope.selectIds.splice(idx, 1);//删除
        }
    }

});