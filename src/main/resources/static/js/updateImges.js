<!--显示照片-->
$(function () {
    $("#headSculptureFile").change(function () {
        var file = this.files[0];
        if (window.FileReader) {
            var reader = new FileReader();
            reader.readAsDataURL(file);
            //监听文件读取结束后事件
            reader.onloadend = function (e) {
                showXY(e.target.result, file.fileName);
            };
        }
    });
});
function showXY(source) {
    $("#nameImage").val("");
    nameImagePreview();
    $("#nameImagePreview").text(" ");
    var img = document.getElementById("loc_img");
    img.src = source;
}