<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>confirm</title>
</head>
<body>
	<script type="text/javascript">
		var msg = "${msg}";		
		var url = "${url}";
		var confirmFlag = confirm(msg);	// 확인 ->true, 취소->false가 반환
		if(confirmFlag == true) {
			location.href = url;
			
		} else {
			history.go(-1);
		}
	</script>

</body>
</html>