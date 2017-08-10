<jsp:include page="/WEB-INF/views/layouts/header.jsp"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@taglib prefix="z" uri="http://taglib.zzzhc.com" %>
<z:breadcrumb breadcrumb="${breadcrumb}"/>

<div class="row-fluid">
    <form action="/roles/${role.id}/save_permissions" method="POST" class="form-horizontal">
        <display:table name="allPermissions" id="permission" class="table table-striped table-bordered">
            <display:column title="">
                <input type="checkbox" name="permissionIds" value="${permission.id}"
                       <c:if test="${rolePermissionIds.contains(permission.id)}">checked</c:if>/>
            </display:column>
            <display:column property="name" title="权限名"/>
            <display:column property="description" title="描述"/>
        </display:table>

        <div class="control-group">
            <div class="controls">
                <button type="submit" class="btn">保存</button>
            </div>
        </div>
    </form>
</div>

<jsp:include page="/WEB-INF/views/layouts/footer.jsp"/>
