 function checkAgentFullName(a) {
    if(a.value == '' && a.value.trim() == '') {
        $("#agentFullName").next().html("<font color='red'>代理商名称不能为空</font>");
        var tt = $("#tyssb").val(false);
        return;
    }
    $("#agentFullName").next().html("<font color='green'>√</font>");
}

function checkshortName(a)
 {
     if(a.value == '' && a.value.trim() == '') {
         $("#shortName").next().html("<font color='red'>代理商简称不能为空</font>");
         var tt = $("#tyssb").val(false);return;
     }
     $("#shortName").next().html("<font color='green'>√</font>");
 }
function checkagentContactPhone(a) {
    if(a.value == '' && a.value.trim() == '') {
        $("#agentContactPhone").next().html("<font color='red'>代理商联系电话不能为空</font>");
        var tt = $("#tyssb").val(false);return;
    }
    var myreg = /^[0-9]*$/;
    if(!myreg.test(a.value)){
        $("#agentContactPhone").next().html("<font color='red'>代理商联系电话格式不正确</font>");
        var tt = $("#tyssb").val(false);return;
        
    }
    $("#agentContactPhone").next().html("<font color='green'>√</font>");
}

function checkemail(a) {
    if(a.value == '' && a.value.trim() == '') {
        $("#email").next().html("<font color='red'>代理商邮箱不能为空</font>");
        var tt = $("#tyssb").val(false);return;
    }
    var myreg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
    if(!myreg.test(a.value)){
        $("#email").next().html("<font color='red'>邮箱格式不正确</font>");
        var tt = $("#tyssb").val(false);return;
        
    }
    $("#email").next().html("<font color='green'>√</font>");
}

function checkofficiallyAccounts(a) {
    if(a.value == '' && a.value.trim() == '') {
        $("#officiallyAccounts").next().html("<font color='red'>代理商公众号不能为空</font>");
        var tt = $("#tyssb").val(false);return;
        
    }
    $("#officiallyAccounts").next().html("<font color='green'>√</font>");
}

function checkbusinessArea(a) {
    if(a.value == '' && a.value.trim() == '') {
        $("#businessArea").next().html("<font color='red'>代理商业务区域范围不能为空</font>");
        var tt = $("#tyssb").val(false);return;
        
    }
    $("#businessArea").next().html("<font color='green'>√</font>");
}

function checkregisterBankName(a) {
    if(a.value == '' && a.value.trim() == '') {
        $("#registerBankName").next().html("<font color='red'>开户户名不能为空</font>");
        var tt = $("#tyssb").val(false);return;
        
    }
    $("#registerBankName").next().html("<font color='green'>√</font>");
}

function checkregisterCardNumber(a) {
    if(a.value == '' && a.value.trim() == '') {
        $("#registerCardNumber").next().html("<font color='red'>开户卡号不能为空</font>");
        var tt = $("#tyssb").val(false);return;
        
    }
    var myreg = /^[0-9]*$/;
    if(!myreg.test(a.value)){
        $("#registerCardNumber").next().html("<font color='red'>开户卡号格式不正确</font>");
        var tt = $("#tyssb").val(false);return;
        
    }
    $("#registerCardNumber").next().html("<font color='green'>√</font>");
}

function checkregisterAccountName(a) {
    if(a.value == '' && a.value.trim() == '') {
        $("#registerAccountName").next().html("<font color='red'>开户行名称不能为空</font>");
        var tt = $("#tyssb").val(false);return;
        
    }
    $("#registerAccountName").next().html("<font color='green'>√</font>");
}

function checkrate(a) {
    if(a.value == '' && a.value.trim() == '') {
        $("#rate").next().html("<font color='red'>必须填写签约费率</font>");
        var tt = $("#tyssb").val(false);return;
        
    }
    var i = a.value;
    if(isNaN(i))
    {
        $("#rate").next().html("<font color='red'>必须输入数字</font> </span>");
        var tt = $("#tyssb").val(false);return;
        
    }
    if(i<0.3) {
        $("#rate").next().html("<font color='red'>费率不能低于自己费率</font> </span>");
        var tt = $("#tyssb").val(false);return;
        
    }
    $("#rate").next().html("<font color='red'><font color='red'>√</font> </span></font>");
}

function checkname(a) {
    if(a.value == '' && a.value.trim() == '') {
        $("#name").next().html("<font color='red'>个人姓名不能为空</font> </span>");
        var tt = $("#tyssb").val(false);return;
        
    }
    $("#name").next().html("<font color='green'>√</font>");
}

function checkphone(a) {
    if(a.value == '' && a.value.trim() == '') {
        $("#phone").next().html("<font color='red'>电话不能为空</font> </span>");
        var tt = $("#tyssb").val(false);return;
        
    }
    var myreg = /^[0-9]*$/;
    if(!myreg.test(a.value)){
        $("#phone").next().html("<font color='red'>电话格式不正确</font> </span>");
        var tt = $("#tyssb").val(false);return;
        
    }
    $("#phone").next().html("<font color='green'>√</font>");
}

function checkmobilePhone(a) {
    if(a.value == '' && a.value.trim() == '') {
        $("#mobilePhone").next().html("<font color='red'>手机号不能为空</font> </span>");
        var tt = $("#tyssb").val(false);return;
        
    }
    var myreg =/^1[34578]\d{9}$/;
    if(!myreg.test(a.value)){
        $("#mobilePhone").next().html("<font color='red'>手机号格式不正确</font> </span>");
        var tt = $("#tyssb").val(false);return;
        
    }
    $("#mobilePhone").next().html("<font color='green'>√</font>");
}

function checkp() {
    var a = document.getElementById("password1").value;
    var b = document.getElementById("password2").value;
    if(a== '' && a.trim() == '') {
        $("#password1").next().html("<font color='red'>密码不能为空</font> </span>");
       var tt = $("#tyssb").val(false);return;
    }else{
        $("#password1").next().html("<font color='green'>√</font> </span>");
    }
    if(a == b){
        $("#password2").next().html("<font color='green'>√</font>");
    }else{
        $("#password2").next().html("<font color='red'>两次密码必须相同</font>");
        var tt = $("#tyssb").val(false);
        return;
    }
}

//提交表单
function submitForm(){
    $("#tyssb").val(true);
    $("#inputForm input").trigger("blur");
    var t = $("#tyssb").val();
   if(t == 'true'){
       $('#inputForm').get(0).submit();
   }else{
        $("#tyssb").val(true);
       alert("请根据提示检查参数")
   }
}



//获取省的下拉框

$("#registerCardCity").html("<option value=\"\" selected='selected'>--请选择城市--</option></option>");
$("#subBranchBank").html("<option value=\"\" selected='selected'>--请选择支行--</option></option>");
$("#ub").val(0);
var info='';
            $.post("getRegisterCardProvinces", function (d) {
                    for (var i = 0; i < d.length; i++) {
                        if(i==0){
                            var t = "<option value=\"" + d[i] + "\" selected='selected'>" + d[i] + "</option>";
                        }
                        else{
                        var t = "<option value=\"" + d[i] + "\">" + d[i] + "</option>";
                        }
                        info = info + t;

                    }

                    $("#registerCardProvinces").html(info);
                   $("#registerCardCity").selectpicker('refresh');
                   $("#subBranchBank").selectpicker('refresh');
                   $("#registerCardProvinces").selectpicker('refresh');
                }
            );

//获取市的下拉框
    $("#registerCardProvinces").change(
        function () {
            //清除市 支行 的下拉框的信息
            var p = $("#registerCardProvinces option:selected").text();
            $("#registerCardCity").html("<option value=\"\" selected='selected'>--请选择城市--</option></option>");
            $("#subBranchBank").html("<option value=\"\" selected='selected'>--请选择支行--</option></option>");
            $("#ub").val(0);
            var info='';
            $.post("getRegisterCardCity", {"province": p}, function (d) {
                    for (var i = 0; i < d.length; i++) {
                        if(i==0){
                            var t = "<option value=\"" + d[i] + "\" selected='selected'>" + d[i] + "</option>";
                        }
                        else{
                            var t = "<option value=\"" + d[i] + "\">" + d[i] + "</option>";
                        }
                        info = info + t;
                    }
                    $("#registerCardCity").html(info);
                $("#registerCardCity").selectpicker('refresh');
                $("#subBranchBank").selectpicker('refresh');
                $("#registerCardProvinces").selectpicker('refresh');
                }
            );
        }
    );

//获取支行的下拉框
    $("#registerCardCity").change(
        function () {
            //获取省 市 选择的
            var p = $("#registerCardProvinces option:selected").text();
            var r = $("#registerCardCity option:selected").text();
            // 清除支行 的下拉框的信息
            $("#subBranchBank").html("<option value=\"\" selected='selected'>--请选择支行--</option></option>");
            $("#ub").val(0);
            var info='';
            $.post("getSubBranchBank", {"province": p, "city": r}, function (d) {
                    for (var i = 0; i < d.length; i++) {
                        if(i==0){
                            var t = "<option value=\"" + d[i] + "\" selected='selected'>" + d[i] + "</option>";
                        }
                        else{
                            var t = "<option value=\"" + d[i] + "\">" + d[i] + "</option>";
                        }
                        info = info + t;
                    }
                    $("#subBranchBank").html(info);
                $("#registerCardCity").selectpicker('refresh');
                $("#subBranchBank").selectpicker('refresh');
                $("#registerCardProvinces").selectpicker('refresh');
                }
            );
        }
    );

//获取银联号
    $("#subBranchBank").change(
        function () {
            var p = $("#registerCardProvinces option:selected").text();
            var s = $("#registerCardCity option:selected").text();
            var z = $("#subBranchBank option:selected").text();
            //清空下拉框
            $("#registerAccountName").html("");
            $.post("getUnionpayNo", {"province": p, "city": s, "bankSubName": z}, function (data) {
                $("#unionBankNumber").html(data);
                $("#ub").val(data);
            });
        }
    );
