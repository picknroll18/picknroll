<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="/resources/css/member/pwd-edit.css">
<main id="main"> 
	<div class="main-container">
		<section id="top-menu">
			<input type="button" class="button home-button" />
		</section>
		
		<section id="main-title"> 
			<h1>비밀번호 변경</h1> 
		</section>
		
		<section id="page-description">
			<h1 class="hide">부가설명</h1> 
			<p>비밀번호는 주기적으로 변경해주세요.</p> 
		</section>
		
		<section id="member-container" class="content-container">
			<h1 class="hide">회원가입폼</h1>
			<form action="" id="member-form">
				<ul>
					<li><label class="list-label" for="">현재 비밀번호</label><input type="password" aria-label="전화번호 또는 이메일" class="input-underline" id="old-password" autocomplete=off /></li>
					<li><label class="list-label" for="">새 비밀번호</label><input type="password" class="input-underline" id="new-password"  autocomplete=off /></li>
					<li><label class="list-label" for="">새 비밀번호 확인</label><input type="password" class="input-underline" id="new-password-check"  autocomplete=off /></li>
	 			</ul>    
				<input id="submit-button" class="button black-button bottom-button" type="button" value="완료" />  
			</form>
		</section>
	</div>  
</main>