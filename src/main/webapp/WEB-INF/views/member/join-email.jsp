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
			<p>환영합니다. PicknRoll입니다. 회원가입을 하기 위해선 이메일을 인증해주세요.</p> 
		</section>
		
		<section id="member-container" class="content-container">
			<h1 class="hide">이메일인증폼</h1>
			<form method="post" id="member-form">
				<ul>
					<li><label class="list-label" for="">이메일</label><input type="text" class="input-underline" name="email" id="email" autocomplete=off /></li>
	 			</ul>    
				<input id="submit-button" class="button black-button bottom-button" type="submit" value="전송" />  
			</form>
		</section>
	</div>  
</main>