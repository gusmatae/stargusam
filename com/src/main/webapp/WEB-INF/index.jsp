<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!DOCTYPE html>
<script src="/boot/test.js"></script>
<script>
if ('serviceWorker' in navigator) {
      navigator.serviceWorker
        .register('/boot/images/service_worker.js')
        .then((pSW) => console.log('서비스 워커가 등록됨!', pSW))
        .catch((pErr) => console.log('서비스 워커가 등록이 안됨!', pErr))
    }
</script>
<script>
$.ajax({
	url : "/boot/bbb",
	type : "POST",
	success : function(result){
		alert(result);
	}
});

very();
</script>
<html>
	<head>
		<meta name="viewpost" content="width=device-width, initial-scale=1, user-scalable=no"
		<link rel="manifest" href="/boot/images/manifest.json">
		<meta charset="UTF-8">
		<title>Title</title>
	</head>
	<body>
   		${list}
	</body>
</html>