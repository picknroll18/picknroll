<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- <link rel="stylesheet" type="text/css" href="/resources/css/member/join.css"> -->
<main id="main"> 
	<div class="main-container">
		<section id="top-menu">
			<input type="button" value="홈버튼" class="button home-button" />
		</section>
		
		<section id="main-title"> 
			<h1>회원가입</h1> 
		</section>
		
		<section id="page-description">
			<h1 class="hide">부가설명</h1> 
			<p>환영합니다. PicknRoll입니다. 회원가입을 하기 위해선 아래 항목을 입력해주세요.</p> 
		</section>
		
		<section id="member-container" class="content-container">
			<h1 class="hide">회원가입폼</h1>
			<form id="member-form" method="post" accept-charset="utf-8">
				<ul>
					<li> 
						<label class="list-label" for="">아이디</label>
						<input type="text" aria-label="전화번호 또는 이메일" class="input-underline" name="id" id="id" autocomplete=off />
						<input type="button" class="id-check-button" value="중복확인">
					</li>
					<li>
						<label class="list-label" for="">비밀번호</label>
						<input type="password" class="input-underline" name="password" id="password"  autocomplete=off />
					</li>
					<li>
						<label class="list-label" for="">비밀번호확인</label>
						<input type="password" class="input-underline" id="password-check"  autocomplete=off />
					</li>
					<li>
						<label class="list-label" for="">닉네임</label>
						<input type="text" class="input-underline" name="nickname" id="nickname" autocomplete=off />
						<input type="button" class="nickname-check-button" value="중복확인">
					</li>
					<li>
						<label class="list-label" for="">이메일</label>
						<input type="text" class="input-underline" name="email" id="email" autocomplete=off />
						<input type="button" class="email-check-button" value="인증">
					</li>
					<li>
						<label class="list-label" for="">비밀번호확인</label>
						<input type="password" class="input-underline" id="password-check"  autocomplete=off />
					</li>
					<!-- 여기에 이메일 인증 관련 UI가 들어가야 함 -->
	 			</ul>    
				<input id="submit-button" class="button black-button bottom-button" type="submit" value="다음" />  
			</form>
		</section>
	</div>  
</main>
<script type="text/javascript">  
	window.addEventListener("load", function(){
		
		// 폼 섹션
		var memberContainer = document.querySelector("#member-container");
		
		// id 검사
		var idCheckButton = memberContainer.querySelector(".id-check-button");
		var idInput = memberContainer.querySelector("input[name='id']");
		
		// 닉네임 검사
		var nicknameCheckButton = memberContainer.querySelector(".nickname-check-button");
		var nicknameInput = memberContainer.querySelector("input[name='nickname']");
		
		// 이메일검사
		var emailCheckButton = memberContainer.querySelector(".email-check-button");
		var emailInput = memberContainer.querySelector("input[name='email']");
        var memberContainerUl = memberContainer.querySelector("form > ul");
		
		// 전송 버튼
		var submitButton = memberContainer.querySelector("#submit-button");
		
		//상태값
		var idCheckStatus = false;
		var nicknameCheckStatus = false;
		var emailCheckStatus = false;
		var certify = null;
		
		emailCheckButton.onclick = function(e){

			var email = emailInput.value;
			
			// 요청
			var request = new XMLHttpRequest();
			
			request.onload = function(e){
		        if (request.status === 200) {
				  	var message = request.responseText;
				  	if(message == "true"){
				  		alert("사용중인 이메일이 있습니다.");
						return;
				 	 }
					
				  	// 성공 콜백
				  	
				  	// 인증 번호 저장, 나중에 비교 해야 함
				  	certify = message;
				  	// input 박스 만들기..

                    var li = document.createElement('li');
                    var liTemplate = '';
                    liTemplate += '<label class="list-label" for="">이메일</label>';
                    liTemplate += '<input type="text" class="input-underline" name="email" id="email" autocomplete=off />';
                    liTemplate += '<input type="button" class="email-check-button" value="확인" />';
                    liTemplate += '<span></span>';
                    li.innerHTML = liTemplate;
                    memberContainerUl.appendChild(li);
				  	
		        } else{  
		          alert('request에 뭔가 문제가 있어요.');
		        }
			}
			
			request.open("get", "is-email-duplicated?email=" + email, true);
			request.send();
			
		}
		
		submitButton.onclick = function(e){
			// 조건검사를 해야 함
			//아이디가 유효하지 않거나 유효성 검사를 통과하지못했을 떄.... 
			if(!idCheckStatus){ //true가 아니면..
				e.preventDefault();
				alert("아이디 중복검사를 하지 않았거나 유효한 아이디가 아닙니다.");
				return;
			}
			
			if(!nicknameCheckStatus){ //true가 아니면..
				e.preventDefault();
				alert("닉네임 중복검사를 하지 않았거나 유효한 아이디가 아닙니다.");
				return;
			}
		}
		
		nicknameCheckButton.onclick = function(e){
			// ajax -> 협력자 백엔드에게 연락해서 알아봐야 함.
			// member/is-id-duplicated
			var nickname = nicknameInput.value;
			
			// 요청
			var request = new XMLHttpRequest();
			
			request.onload = function(e){
		        if (request.status === 200) {
				  	var duplicated = JSON.parse(request.responseText);
				  	var message = request.responseText;
				  	if(message == "true"){
						  alert("이미 사용중인 이메일입니다.");
						  return;
				 	 }
					alert("사용해도 좋습니다~~");
					nicknameCheckStatus = true;  
		        } else{  
		          alert('request에 뭔가 문제가 있어요.');
		        }
			}
			
			request.open("get", "is-nickname-duplicated?nickname=" + nickname, true);
			request.send();
		}

		idCheckButton.onclick = function(e){
			
			// ajax -> 협력자 백엔드에게 연락해서 알아봐야 함.
			// member/is-id-duplicated
			var id = idInput.value;
			// 요청
			var request = new XMLHttpRequest();
			
			request.onload = function(e){
		        if (request.status === 200) {
				  	var duplicated = JSON.parse(request.responseText);
				  	if(duplicated){
						  alert("이미 사용중인 아이디입니다.");
						  return;
				 	 }
					alert("사용해도 좋습니다~~");
					idCheckStatus = true;  
		        } else{  
		          alert('request에 뭔가 문제가 있어요.');
		        }
			}
			
			request.open("get", "is-id-duplicated?id=" + id, true);
			request.send();
		}
		
	});
</script>