<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <script type="text/javascript" src="static/js/jquery-3.4.1.js"></script>
        <script type="text/javascript">
            $(function () {
                $("#bt").click(function () {
                    $.ajax({
                        dataType:"text",
                        url:"ShowStudent",
                        success:function (responseType) {
                            alert(responseType)
                        }
                    })
                })
            })
        </script>
        <button id="bt">点击</button>
    </body>
</html>
