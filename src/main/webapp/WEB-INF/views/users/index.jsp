<jsp:include page="/WEB-INF/views/layouts/header.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="/WEB-INF/zzzhc.tld" prefix="z"%>
<div class="row-fluid">
  <div class="pull-left">
    <h3>用户列表</h3>
  </div>
  <div class="pull-right">
    <a class="btn btn-primary" href="<c:url value="/users/new"/>">创建用户</a>
  </div>
</div>
<display:table name="users.data" id="user" class="table table-striped table-bordered">
	<display:column property="id" title="ID"/>
	<display:column title="Name">
		<a href="/users/${user.id}">${user.name}</a>
	</display:column>
	<display:column property="email" />
</display:table>
<z:pagination name="users" />

<jsp:include page="/WEB-INF/views/layouts/footer.jsp"/>
