/**
 * 品牌管理服务层
 */


app.service('specificationService',function($http){

    //读取列表数据绑定到表单中
    this.findAll=function () {
        return $http.get('../../specification/findSpecAll.do');
    }

    //分页查询
    this.findAllByPage = function(page, pageSize){
       return $http.get('../../specification/findAllByPages.do?page='+page+'&pageSize='+pageSize);
    }

    this.findOptionAll = function(specId){
        return $http.get('../../specification/findOptionAll.do?specId='+specId);
    }

});