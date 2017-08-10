<jsp:include page="/WEB-INF/views/layouts/header.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://taglib.zzzhc.com" prefix="z"%>
<div class="row-fluid clearfix">
  <div class="pull-left">
    <h3>角色查询</h3>
  </div>
  <div class="pull-right">
    <a class="btn btn-primary" href="<c:url value="/roles/new"/>">创建角色</a>
  </div>
</div>
<div class="row-fluid">
<form:form action="/roles" method="GET"
	modelAttribute="qf" cssClass="basic-form form-horizontal">
	<div class="control-group">
		<label class="control-label" for="name">角色名</label>
		<div class="controls">
			<input type="text" name="name" value="${ qf.get("name") }" class="required" placeholder="角色名" />
		</div>
	</div>
	<div class="control-group">
		<div class="controls">
			<button type="submit" class="btn">查询</button>
		</div>
	</div>
</form:form>
</div>
<display:table name="roles.data" id="role_" class="table table-striped table-bordered">
	<display:column title="ID">
		${role_.id}
	</display:column>
	<display:column title="角色名">
		<a href="/roles/${role_.id}">${role_.name}</a>
	</display:column>
	<display:column property="description" title="描述" />
	<display:column property="createdAt" title="创建时间" />
</display:table>
<z:pagination name="roles" />

<jsp:include page="/WEB-INF/views/layouts/footer.jsp"/>
