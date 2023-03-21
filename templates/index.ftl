<#include "header.ftl">
	
	<#include "menu.ftl">

	<div class="page-header">
		<h1>Latest Posts</h1>
	</div>
	<#list posts as post>
  		<#if (post.status == "published")>
  			<a href="${post.uri}"><h2>${post.title}</h2></a>
  		</#if>
  	</#list>
	
	<hr />

<#include "footer.ftl">