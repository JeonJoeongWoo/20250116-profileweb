/**
 * 
 */

function writeCheck() {
	
	if(document.writeForm.btitle.value.length == 0) {
		alert("제목은 반드시 입력하여야 합니다.");
		document.writeForm.btitle.focus();
		return false;
	}
	
	if(document.writeForm.btitle.value.length >= 50) {
			alert("제목은 50자이내로 입력하여야 합니다.");
			document.writeForm.btitle.focus();
			return false;
	}
	
	if(document.writeForm.bcontent.value.length <= 10) {
			alert("내용은 10자 이상 입력하여야 합니다.");
			document.writeForm.bcontent.focus();
			return false;
	}
	
	if(document.writeForm.bcontent.value.length > 200) {
				alert("내용은 200자 이내로 입력하여야 합니다.");
				document.writeForm.bcontent.focus();
				return false;
	}
	
	return true;
	
}