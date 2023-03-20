<#include "header.ftl">
	
	<#include "menu.ftl">

	<div class="page-header">
		<h1>Java Jottings</h1>
	</div>
	<#list posts as post>
  		<#if (post.status == "published")>
  			<a href="${post.uri}"><h1>${post.title}</h1></a>
  			<p>${post.body}</p>
  		</#if>
  	</#list>
	
	<hr />

<#include "footer.ftl">