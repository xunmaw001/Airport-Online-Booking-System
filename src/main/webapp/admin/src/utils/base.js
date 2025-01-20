const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm00rk3/",
            name: "ssm00rk3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm00rk3/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "机场网上订票系统"
        } 
    }
}
export default base
