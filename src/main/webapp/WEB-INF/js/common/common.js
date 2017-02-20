/**
 * 
 */

$(function() {
	$.common = {};
	$.extend($.common, {
		ajaxPost : function(option) {
			var def = {
				url : "",
				data : {},
				async : false,
				callBack : function(data) {
				},
				errorCallBack : function(data) {
				}
			};
			$.extend(def, option);
			$.ajax({
				url : def.url,
				type : "POST",
				dataType : "json",
				data : def.data,
				async : def.async,
				success : function(result) {
					if (result.success) {
						def.callBack(result.data)
					} else {
						def.errorCallBack(result.data);
					}
				},
				error : function() {
					alert("error");
				}
			});

		}
	});
});