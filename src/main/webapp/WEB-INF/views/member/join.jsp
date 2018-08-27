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
			<p>회원가입폼입니다.</p> 
		</section>
		
		<section id="member-container" class="content-container">
			<h1 class="hide">회원가입폼</h1>
			<form action="" id="member-form">
				<ul>
					<li><label for="">아이디</label><input type="text" class="input-text" id="id" placeholder="아이디를 입력해주세요." autocomplete=off /></li>
					<li><label for="">비밀번호</label><input type="password" class="input-text" id="password" placeholder="비밀번호를 입력해주세요." autocomplete=off /></li>
					<li><label for="">비밀번호확인</label><input type="text" class="input-text" id="password-check" placeholder="비밀번호를 다시 입력해주세요." autocomplete=off /></li>
					<li><label for="">닉네임</label><input type="text" class="input-text" id="nickname" placeholder="닉네임을 입력해주세요." autocomplete=off /></li>
					<li><label for="">이메일</label><input type="text" class="input-text" id="email" placeholder="이메일을 입력해주세요." autocomplete=off /></li>
	 			</ul>    
				<input id="submit-button" class="button black-button bottom-button" type="button" value="다음" />  
			</form>
		</section>
	</div>
</main>