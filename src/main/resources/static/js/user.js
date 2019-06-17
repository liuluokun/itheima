var vue = new Vue({
    el:"#app",
    data:{
        userList:[],
        user:{}
    },
    methods:{
        findAll:function () {
            axios.get("./user/findAll").then(function (response) {
                vue.userList=response.data;
            }).catch(function (err) {
                alert("查询所有失败:"+err)
            })
        },

        findOne:function(id){
            axios.get("./user/findOne/"+id).then(function (response){
                vue.user = response.data;
            }).catch(function (err) {
                alert("查询一个失败"+err)
            })
        },

        update:function () {
            axios.post("./user/update",this.user).then(function (response) {
                vue.findAll();
            }).catch(function (err) {
                alert("修改失败:"+err)
            })
        }
    },

    created:function () {
        this.findAll();
    }
})