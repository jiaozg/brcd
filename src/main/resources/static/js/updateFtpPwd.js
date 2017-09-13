$(document).ready(function () {
    $("#ftpUserNameID").focus();
    $("#inputForm").validate({
        rules: {
            oldFtpUserName: {
                required: true,
                minlength: 3,
                maxlength: 11,
                remote: {
                    url: "checkFtpPwd",
                    type: "post",
                    dataType: "json",
                    data: {
                        ftpUserName: function () {
                            return $("#ftpUserNameID").val();
                        }
                    },
                    dataFilter: function (data) {
                        return data;
                    }
                }
            },
            oldFtpPassword: {
                required: true,
                remote: {
                    url: "checkFtpPwd",
                    type: "post",
                    dataType: "json",
                    data: {
                        ftpPassword: function () {
                            return $("#oldPassword").val();
                        }
                    },
                    dataFilter: function (data) {
                        return data;
                    }
                }
            }
            ,
            password: {
                required: true,
            }
            ,
            confirmNewPassword: {
                required: true,
            }
            ,
        },
        messages: {
            oldFtpUserName: {
                required: "请输入用户名",
                remote: "用户名不正确"
            }
            ,
            oldFtpPassword: {
                required: "请输入旧密码",
                remote: "密码不正确"
            }
            ,
            password: {
                required: "请输入新密码",
            }
            ,
            confirmNewPassword: {
                required: "请确认新密码",
                equalTo: "输入与上面相同的密码"
            }
            ,

        }
        ,
        submitHandler: function (form) {
            loading('正在提交，请稍等...');
            form.submit();
        }
        ,
        errorContainer: "#messageBox",
        errorPlacement: function (error, element) {
            $("#messageBox").text("输入有误，请先更正。");
            if (element.is(":checkbox") || element.is(":radio") || element.parent().is(".input-append")) {
                error.appendTo(element.parent().parent());
            } else {
                error.insertAfter(element);
            }
        }
    })
    ;
});
