<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="/resources/css/member/join.css">
<main id="main"> 
	<div class="main-container">
		<section id="top-menu">
			<input type="button" class="button home-button" />
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
			<form action="" id="member-form">
				<ul>
					<li><label class="list-label" for="">아이디</label><input type="text" aria-label="전화번호 또는 이메일" class="input-underline" id="id" autocomplete=off /></li>
					<li><label class="list-label" for="">비밀번호</label><input type="password" class="input-underline" id="password"  autocomplete=off /></li>
					<li><label class="list-label" for="">비밀번호확인</label><input type="password" class="input-underline" id="password-check"  autocomplete=off /></li>
					<li><label class="list-label" for="">닉네임</label><input type="text" class="input-underline" id="nickname" autocomplete=off /></li>
					<li><label class="list-label" for="">이메일</label><input type="text" class="input-underline" id="email"  autocomplete=off /></li>
	 			</ul>    
				<input id="submit-button" class="button black-button bottom-button" type="button" value="다음" />  
			</form>
		</section>
	</div>  
</main>