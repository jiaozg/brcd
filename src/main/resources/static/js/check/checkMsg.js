$(document).ready(function () {
    $("#inputForm").validate({
        rules: {
            email: {
                required: true,
                email: true
            },
            phone: {
                required: true,
                digits: true,
                minlength: 7,
                maxlength: 11,
            },
            mobilePhone: {
                required: true,
                digits: true,
                minlength: 11,
                maxlength: 11,
            },
        }, messages: {
            email: {
                required: "请输入邮箱",
                email: "请输入邮箱正确的邮箱",
            }, phone: {
                required: "请输入电话号",
                digits: "只能输入数字",
                maxlength: $.validator.format("最多可以输入 {0} 个字符"),
                minlength: $.validator.format("最少要输入 {0} 个字符"),
            }, mobilePhone: {
                required: "请输入手机号",
                digits: "只能输入数字",
                maxlength: $.validator.format("最多可以输入 {0} 个字符"),
                minlength: $.validator.format("最少要输入 {0} 个字符"),
            }
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