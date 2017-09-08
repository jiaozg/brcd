$(document).ready(function () {
    $("#oldPassword").focus();
    $("#inputForm").validate({
        rules: {
            oldPassword: {
                required: true,
                remote: {
                    url: "checkPwd",
                    type: "post",
                    dataType: "json",
                    data: {
                        password: function () {
                            return $("#oldPassword").val();
                        }, id: function () {
                            return $("#id").val();
                        }
                    },
                    dataFilter: function (data) {
                        return data;
                        // if (data == "true") {
                        //     return true;
                        // }
                        // else {
                        //     return false;
                        // }
                    }
                }
            }
        },
        messages: {
            oldPassword: {
                required: "请输入旧密码",
                remote: "密码不正确"
            },
            confirmNewPassword: {equalTo: "输入与上面相同的密码"},

        },
        submitHandler: function (form) {
            loading('正在提交，请稍等...');
            form.submit();
        },
        errorContainer: "#messageBox",
        errorPlacement: function (error, element) {
            $("#messageBox").text("输入有误，请先更正。");
            if (element.is(":checkbox") || element.is(":radio") || element.parent().is(".input-append")) {
                error.appendTo(element.parent().parent());
            } else {
                error.insertAfter(element);
            }
        }
    });
});
