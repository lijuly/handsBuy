/**
 * 品牌管理服务层
 */


app.service('brandService',function($http){

    //读取列表数据绑定到表单中
    this.findAll=function () {
        return $http.get('../../brand/findAll.do');
    }

    //分页查询
    this.findAllByPage = function(page, pageSize){
       return $http.get('../../brand/findAllByPages.do?page='+page+'&pageSize='+pageSize);
    }

    this.save = function (methodName, entity) {
        return $http.post('../../brand/'+ methodName, entity);
    }

    this.delete = function (selectIds) {
        //获取选中的复选框
        return $http.get('../../brand/deleteBrand.do?ids='+selectIds);
    }


});