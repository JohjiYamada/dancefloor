(this["webpackJsonpmy-first-app"]=this["webpackJsonpmy-first-app"]||[]).push([[0],{178:function(e,t,a){e.exports=a(293)},183:function(e,t,a){},293:function(e,t,a){"use strict";a.r(t);var n=a(0),l=a.n(n),r=a(12),i=a.n(r),c=(a(183),a(151)),o=a.n(c),s=a(161),u=a(159),d=a.n(u),m=a(160),p=a.n(m),f=a(60),h=a(10),g=a(13),b=a(33),y=a(27),E=a.n(y),O=a(3),v=a(351),j=a(9),k=a(360),S=a(361),w=a(357),C=a(359),D=a(355),N=a(369),x=a(356),P=a(371),B=a(358),T=a(113),I=a(350),Y=a(368),_=a(298),M=a(372),R=a(85),F=a.n(R),L=a(154),V=a.n(L),W=a(156),z=a.n(W),J=a(155),A=a.n(J),K=a(370),U=a(364),H=a(363),q=a(365),G=a(362),$=a(299),Q=a(38),X=a(354),Z=a(352),ee=a(353),te=a(112),ae=a.n(te),ne=a(164),le=a(344),re=a(303),ie=a(373),ce=a(301),oe=a(296),se=a(297),ue=a(304),de=a(75),me=function(e){var t=e.InputProps,a=(e.className,e.label,e.style,e.isReadOnly,e.variant,Object(ne.a)(e,["InputProps","className","label","style","isReadOnly","variant"]));return l.a.createElement(le.a,Object.assign({},a,{className:t.className,label:t.label,style:t.style,InputLabelProps:{shrink:!0},inputProps:{readOnly:t.isReadOnly},variant:t.variant}))},pe=Object(h.e)((function(e){var t=e.className,a=e.headCell,n=e.result,r=e.setResult,i=e.isEdit,c=e.isNew,o=e.getStringFromDate,s=e.selection,u=e.changeSelection,d=e.getSelectionValue,m=l.a.useRef(null),p=l.a.useState(0),f=Object(g.a)(p,2),h=f[0],y=f[1];if(l.a.useEffect((function(){m.current&&y(m.current.offsetWidth)}),[i,c]),!a.show)return"";if("special"===a.type)return"";if(c&&("id"===a.type||"prcDate"===a.type||"prcUser"===a.type))return"";if(!n)return"loading...";var E=!((i||c)&&"id"!=a.type&&"prcUser"!=a.type&&"prcDate"!=a.type),O="",v={};if(n.errorDetails&&n.errorDetails[a.field]&&(v={error:!0},O=n.errorDetails[a.field]),"selection"===a.type)return l.a.createElement(oe.a,Object.assign({},E?{}:{variant:"outlined"},{className:t},v),l.a.createElement(re.a,Object.assign({htmlFor:a.id,shrink:!0,ref:m},v),a.label),l.a.createElement(ce.a,Object.assign({style:a.style,id:a.id+"sel",value:n[a.field],onChange:function(e){return u(a.field,e)},label:a.label,inputProps:{readOnly:E}},E?{}:{input:l.a.createElement(ue.a,Object.assign({notched:"true",labelWidth:h,name:a.label,id:a.id},v))}),s[a.selectionEnum].map((function(e){return l.a.createElement(ie.a,Object.assign({},E?{}:{variant:"outlined"},{value:e.selectionValue,style:a.style}),e.dispName)}))),l.a.createElement(se.a,null,O));var j=function(e){var t=e.target.value;if("dateTime"===a.type||"prcDate"===a.type){var l=new Date,i=("0"+Math.floor(l.getTimezoneOffset()/-60)).slice(-2),c=("0"+Math.floor(l.getTimezoneOffset()%-60)).slice(-2);t=e.target.value+".000+"+i+":"+c}r(Object(Q.a)(Object(Q.a)({},n),{},Object(b.a)({},a.field,t)))},k=function(){return"date"===a.type||"dateTime"===a.type||"prcDate"===a.type||"time"===a.type?o(n[a.field],a.type):"selection"===a.type?d(n[a.field],a.selectionEnum):n[a.field]},S={};return"dateTime"===a.type||"prcDate"===a.type?S={type:"datetime-local"}:"date"===a.type?S={type:"date"}:"time"===a.type&&(S={type:"time"}),"number"===a.type||"price"===a.type?l.a.createElement(de.a,Object.assign({key:a.id,customInput:me,className:t,InputProps:Object(Q.a)(Object(Q.a)({},v),{},{helperText:O,className:t,label:a.label,style:a.style,isReadOnly:E,inputProps:{readOnly:E}},E?{}:{variant:"outlined"}),value:k(),thousandSeparator:!0},E?{}:{variant:"outlined"},{onValueChange:function(e){j({target:{value:e.value}})}})):l.a.createElement(le.a,Object.assign({},v,{className:t,id:a.id,key:a.id,label:a.label,onChange:j,defaultValue:k(),style:a.style,InputLabelProps:{shrink:!0},inputProps:{readOnly:E}},S,E?{}:{variant:"outlined"},{helperText:O}))})),fe=Object(v.a)((function(e){return{margin:{margin:e.spacing(1)}}})),he=Object(h.e)((function(e){var t=e.headCells,a=e.result,n=e.title,r=e.setResult,i=e.finalize,c=e.isNew,o=e.apiUrl,s=e.getSelectionValue,u=e.getStringFromDate,d=e.selection,m=l.a.useState(!1),p=Object(g.a)(m,2),f=p[0],h=p[1],y=l.a.useState(JSON.parse(JSON.stringify(a))),O=Object(g.a)(y,1)[0],v=fe(),j=function(e,t){r(Object(Q.a)(Object(Q.a)({},a),{},Object(b.a)({},e,t.target.value)))};return a?l.a.createElement("form",{className:v.margin},null===n?"":l.a.createElement(T.a,{variant:"h6",id:"formTitle",component:"div"},n),c?l.a.createElement(l.a.Fragment,null,l.a.createElement(X.a,{color:"primary","aria-label":"outlined primary button group",className:v.margin},l.a.createElement($.a,{variant:"contained",color:"primary",size:"small",startIcon:l.a.createElement(ae.a,null),onClick:function(e){E.a.post(o,a).then((function(e){r(e.data),e.data.errorDetails||i&&i()})).catch((function(e){console.log(e),new Error(e)}))}},"\u65b0\u898f\u767b\u9332"))):l.a.createElement(l.a.Fragment,null,l.a.createElement(Z.a,{key:"editSwitch",control:l.a.createElement(ee.a,{checked:f,onChange:function(e){h(e.target.checked),r(JSON.parse(JSON.stringify(O)))}}),label:"\u7de8\u96c6"}),l.a.createElement(X.a,{color:"primary","aria-label":"outlined primary button group",className:v.margin},f?l.a.createElement($.a,{variant:"contained",color:"primary",size:"small",startIcon:l.a.createElement(ae.a,null),onClick:function(e){E.a.post(o+a.id,a).then((function(e){r(e.data),e.data.errorDetails||(h(!1),i&&i())})).catch((function(e){console.log(e),new Error(e)}))}},"\u66f4\u65b0"):"",f?l.a.createElement($.a,{variant:"contained",color:"primary",size:"small",startIcon:l.a.createElement(F.a,null),onClick:function(){E.a.delete(o+a.id).then((function(e){i()})).catch((function(e){return new Error(e)}))}},"\u524a\u9664"):"")),l.a.createElement("br",null),l.a.createElement(l.a.Fragment,null,t.map((function(e){return l.a.createElement(pe,{className:v.margin,headCell:e,result:a,setResult:r,isEdit:f,isNew:c,getStringFromDate:u,selection:d,changeSelection:j,getSelectionValue:s})})))):"loading..."})),ge=a(167),be=a(152),ye=a.n(be),Ee=Object(v.a)((function(e){return{root:{padding:"2px 4px",display:"flex",alignItems:"center",width:400},input:{marginLeft:e.spacing(1),flex:1},iconButton:{padding:10}}})),Oe=function(e){var t=e.handleSearch,a=e.keyword,n=e.setKeyword,r=Ee();return l.a.createElement(I.a,{className:r.root,variant:"outlined"},l.a.createElement(ge.a,{className:r.input,inputProps:{"aria-label":"\u691c\u7d22"},onChange:function(e){n(e.target.value)},defalutValue:a,onKeyDown:function(e){13===e.keyCode&&t()}}),l.a.createElement(_.a,{onClick:t,className:r.iconButton,"aria-label":"search"},l.a.createElement(ye.a,null)))},ve=function(e){var t=e.classes,a=e.onSelectAllClick,n=e.order,r=e.orderBy,i=e.numSelected,c=e.rowCount,o=e.onRequestSort,s=e.headCells;return l.a.createElement(D.a,null,l.a.createElement(x.a,null,s.map((function(e){if(e.show)return"special"==e.type?"_checkBox"==e.id?l.a.createElement(w.a,{padding:"checkbox"},l.a.createElement(Y.a,{indeterminate:i>0&&i<c,checked:c>0&&i===c,onChange:a,inputProps:{"aria-label":"select all desserts"}})):l.a.createElement(w.a,{padding:"checkbox"}):l.a.createElement(w.a,{key:e.id,align:e.numeric?"right":"left",padding:"default",sortDirection:r===e.id&&n},l.a.createElement(P.a,{active:r===e.id,direction:r===e.id?n:"asc",onClick:(s=e.id,function(e){o(e,s)})},e.label,r===e.id?l.a.createElement("span",{className:t.visuallyHidden},"desc"===n?"sorted descending":"sorted ascending"):null));var s}))))},je=function(e){var t=e.numSelected,a=e.title,n=e.handleNewOpen,r=e.handleDelOpen,i=e.handleSearch,c=e.keyword,o=e.setKeyword,s=Object(v.a)((function(e){return{root:{paddingLeft:e.spacing(2),paddingRight:e.spacing(1)},highlight:"light"===e.palette.type?{color:e.palette.secondary.main,backgroundColor:Object(j.d)(e.palette.secondary.light,.85)}:{color:e.palette.text.primary,backgroundColor:e.palette.secondary.dark},title:{flex:"1 1 100%"}}}))();return l.a.createElement(B.a,{className:Object(O.a)(s.root,Object(b.a)({},s.highlight,t>0))},t>0?l.a.createElement(T.a,{className:s.title,color:"inherit",variant:"subtitle1",component:"div"},t," \u9078\u629e\u4e2d"):l.a.createElement(T.a,{className:s.title,variant:"h6",id:"tableTitle",component:"div"},a),t>0?l.a.createElement(M.a,{title:"\u524a\u9664"},l.a.createElement(_.a,{"aria-label":"\u9078\u629e\u3057\u305f\u9805\u76ee\u3092\u524a\u9664",onClick:r},l.a.createElement(F.a,null))):l.a.createElement(l.a.Fragment,null,l.a.createElement(Oe,{handleSearch:i,keywork:c,setKeyword:o}),l.a.createElement(M.a,{title:"\u65b0\u898f\u4f5c\u6210"},l.a.createElement(_.a,{onClick:n,"aria-label":"\u65b0\u898f\u30c7\u30fc\u30bf\u8ffd\u52a0"},l.a.createElement(V.a,null)))))},ke=function(e){var t=e.headCells,a=e.row,n=e.selected,r=e.labelId,i=e.setSelected,c=e.history,o=e.handleClickDetail,s=e.getSelectionValue,u=e.getStringFromDateGrid;return t.map((function(e){if(e.show||"special"==e.type){if("special"==e.type){if("_checkBox"==e.id){var t=(d=a.id,-1!=n.indexOf(d));return l.a.createElement(w.a,{padding:"checkbox"},l.a.createElement(Y.a,{checked:t,onClick:function(e){return function(e,t){var a=n.indexOf(t),l=[];-1===a?l=l.concat(n,t):0===a?l=l.concat(n.slice(1)):a===n.length-1?l=l.concat(n.slice(0,-1)):a>0&&(l=l.concat(n.slice(0,a),n.slice(a+1))),i(l)}(0,a.id)},inputProps:{"aria-labelledby":r}}))}if("_linkBtn"==e.id)return l.a.createElement(w.a,{padding:"checkbox"},l.a.createElement(M.a,{title:"Edit"},l.a.createElement(_.a,{"aria-label":"\u8a73\u7d30\u30da\u30fc\u30b8\u3078"},l.a.createElement(A.a,{onClick:function(){return t=e.link,void c.push(t);var t}}))));if("_editBtn"==e.id)return l.a.createElement(w.a,{padding:"checkbox"},l.a.createElement(M.a,{title:"Edit"},l.a.createElement(_.a,{"aria-label":"\u7de8\u96c6"},l.a.createElement(z.a,{onClick:o}))))}else{if("prcDate"===e.type||"date"===e.type||"dateTime"===e.type)return l.a.createElement(w.a,{align:e.numeric?"right":"left"},u(a[e.field],e.type));if("selection"===e.type)return l.a.createElement(w.a,{align:e.numeric?"right":"left"},s(a[e.field],e.selectionEnum));if("number"===e.type||"price"===e.type)return l.a.createElement(w.a,{align:e.numeric?"right":"left"},l.a.createElement(de.a,{value:a[e.field],thousandSeparator:!0,displayType:"text"}))}return l.a.createElement(w.a,{align:e.numeric?"right":"left"},a[e.field])}var d}))},Se=Object(h.e)((function(e){var t=e.table,a=e.header,r=e.title,i=e.history,c="/api/"+t+"/",o=Object(n.useState)(a),s=Object(g.a)(o,2),u=s[0],d=s[1],m=Object(n.useState)(null),p=Object(g.a)(m,2),f=p[0],h=p[1],b=Object(n.useState)(!0),y=Object(g.a)(b,2),O=y[0],j=y[1],D=Object(n.useState)("desc"),P=Object(g.a)(D,2),B=P[0],T=P[1],Y=Object(n.useState)("id"),_=Object(g.a)(Y,2),M=_[0],R=_[1],F=Object(n.useState)([]),L=Object(g.a)(F,2),V=L[0],W=L[1],z=Object(n.useState)(0),J=Object(g.a)(z,2),A=J[0],Q=J[1],X=Object(n.useState)(5),Z=Object(g.a)(X,2),ee=Z[0],te=Z[1],ae=Object(n.useState)(!1),ne=Object(g.a)(ae,2),le=ne[0],re=ne[1],ie=Object(n.useState)(!1),ce=Object(g.a)(ie,2),oe=ce[0],se=ce[1],ue=Object(n.useState)([]),de=Object(g.a)(ue,2),me=de[0],pe=de[1],fe=Object(n.useState)(""),ge=Object(g.a)(fe,2),be=ge[0],ye=ge[1],Ee=Object(n.useState)({}),Oe=Object(g.a)(Ee,2),Se=Oe[0],we=Oe[1],Ce=Object(v.a)((function(e){return{root:{width:"100%"},paper:{width:"100%",marginBottom:e.spacing(2)},table:{minWidth:750},visuallyHidden:{border:0,clip:"rect(0 0 0 0)",height:1,margin:-1,overflow:"hidden",padding:0,position:"absolute",top:20,width:1}}}))();Object(n.useEffect)((function(){Be(c)}),[]);var De=function(e,t){if(!e)return"";var a=new Date(e);return"dateTime"===t||"prcDate"===t?a.toLocaleString():"date"===t?a.toLocaleDateString():e},Ne=function(e,t){return null!==e?Se[t][e].dispName:""},xe=function(e,t,a){if(!t.show)return!1;if(null==e)return!1;if("id"===t.type&&"special"===t.type)return!1;if("selection"===t.type){var n=Ne(e,t.selectionEnum);return null!=n&&n.toLowerCase().includes(a.toLowerCase())}if("prcDate"===t.type||"date"===t.type||"dateTime"===t.type){var l=De(e,t.type);return null!=l&&l.includes(a)}return e.toString().toLowerCase().includes(a.toLowerCase())},Pe=function(e,t,a){return t[a]<e[a]?-1:t[a]>e[a]?1:0},Be=function(e){E.a.get("/api/head_cell/"+t).then((function(t){d(a.concat(t.data)),E.a.get(e).then((function(e){Object.keys(Se).length?pe(e.data):t.data.map((function(t){t.selectionEnum&&E.a.get("/api/selection/"+t.selectionEnum).then((function(t){we(Object.assign(Se,t.data)),pe(e.data)})).catch((function(e){return new Error(e)}))}))})).catch((function(e){return new Error(e)}))})).catch((function(e){return new Error(e)}))},Te=function(){Be(c),Ie(),Ye()},Ie=function(){re(!1)},Ye=function(){se(!1)},_e=ee-Math.min(ee,me.length-A*ee);return l.a.createElement("div",{className:Ce.root},l.a.createElement(I.a,{className:Ce.paper},l.a.createElement(je,{numSelected:V.length,title:r,handleNewOpen:function(){var e=new Object;u.forEach((function(t){"special"!=t.type&&(e[t.field]=null)})),h(e),j(!1),re(!0)},handleDelOpen:function(){se(!0)},handleSearch:function(){if(be.length>0){var e=[];me.forEach((function(t){var a=!1;u.forEach((function(e){a||xe(t[e.field],e,be)&&(a=!0)})),a&&e.push(t)})),pe(e)}else Be(c)},keyword:be,setKeyword:ye}),l.a.createElement(C.a,null,l.a.createElement(k.a,{className:Ce.table,"aria-labelledby":"tableTitle",size:"small","aria-label":"enhanced table"},l.a.createElement(ve,{classes:Ce,numSelected:V.length,order:B,orderBy:M,onSelectAllClick:function(e){if(e.target.checked){var t=me.map((function(e){return e.id}));W(t)}else W([])},onRequestSort:function(e,t){T(M===t&&"asc"===B?"desc":"asc"),R(t)},rowCount:me.length,headCells:u}),l.a.createElement(S.a,null,function(e,t){var a=e.map((function(e,t){return[e,t]}));return a.sort((function(e,a){var n=t(e[0],a[0]);return 0!==n?n:e[1]-a[1]})),a.map((function(e){return e[0]}))}(me,function(e,t){return"desc"===e?function(e,a){return Pe(e,a,t)}:function(e,a){return-Pe(e,a,t)}}(B,M)).slice(A*ee,A*ee+ee).map((function(e,t){var a,n=(a=e.id,-1!==V.indexOf(a)),r="enhanced-table-checkbox-".concat(t);return l.a.createElement(x.a,{hover:!0,role:"checkbox","aria-checked":n,tabIndex:-1,key:e.id,selected:n},l.a.createElement(ke,{headCells:u,row:e,selected:V,labelId:r,setSelected:W,history:i,handleClickDetail:function(){return function(e){h(e),j(!0),re(!0)}(e)},getSelectionValue:Ne,getStringFromDateGrid:De}))})),_e>0&&l.a.createElement(x.a,{style:{height:33*_e}},l.a.createElement(w.a,{colSpan:6}))))),l.a.createElement(N.a,{rowsPerPageOptions:[5,10,25],component:"div",count:me.length,rowsPerPage:ee,page:A,onChangePage:function(e,t){Q(t)},onChangeRowsPerPage:function(e){te(parseInt(e.target.value,10)),Q(0)}})),l.a.createElement(K.a,{key:"detailDialog",open:le,onClose:Te,"aria-labelledby":"form-dialog-title",maxWidth:"lg"},l.a.createElement(G.a,{id:"form-dialog-title"},r),l.a.createElement(H.a,null,l.a.createElement(he,{result:f,headCells:u,title:null,setResult:h,finalize:Te,isNew:!O,apiUrl:c,getSelectionValue:Ne,getStringFromDate:function(e,t){var a=new Date(e);if(!e)return"";if("time"===t)return e;var n=a.getFullYear(),l=1+a.getMonth(),r=a.getDate(),i=a.getHours(),c=a.getMinutes(),o=a.getSeconds();l=("0"+l).slice(-2),r=("0"+r).slice(-2),i=("0"+i).slice(-2),c=("0"+c).slice(-2),o=("0"+o).slice(-2);var s="YYYY-MM-DDThh:mm:ss";return"dateTime"===t||"prcDate"===t?s=(s=(s=(s=(s=(s=s.replace(/YYYY/g,n)).replace(/MM/g,l)).replace(/DD/g,r)).replace(/hh/g,i)).replace(/mm/g,c)).replace(/ss/g,o):"date"===t&&(s=(s=(s=(s="YYYY-MM-DD").replace(/YYYY/g,n)).replace(/MM/g,l)).replace(/DD/g,r)),s},selection:Se})),l.a.createElement(U.a,null,l.a.createElement($.a,{onClick:Te,color:"primary"},"\u9589\u3058\u308b"))),l.a.createElement(K.a,{open:oe,keepMounted:!0,onClose:Ye,"aria-labelledby":"alert-dialog-slide-title","aria-describedby":"alert-dialog-slide-description"},l.a.createElement(G.a,{id:"delete-dialog"},"\u524a\u9664\u78ba\u8a8d"),l.a.createElement(H.a,null,l.a.createElement(q.a,{id:"alert-dialog-slide-description"},"\u9078\u629e\u3057\u305f\u9805\u76ee\u3092\u524a\u9664\u3057\u307e\u3059\u3002\u3088\u308d\u3057\u3044\u3067\u3059\u304b\uff1f")),l.a.createElement(U.a,null,l.a.createElement($.a,{onClick:function(){E.a.delete(c,{data:V,headers:{"Content-Type":"application/json"}}).then((function(e){W([]),Te()})).catch((function(e){return new Error(e)}))},color:"primary"},"\u306f\u3044"),l.a.createElement($.a,{onClick:Ye,color:"primary"},"\u30ad\u30e3\u30f3\u30bb\u30eb"))))})),we=a(366),Ce=Object(h.e)((function(){var e={header:[{id:"_checkBox",type:"special",numeric:!1,label:"",show:!0},{id:"_linkBtn",type:"special",numeric:!1,link:"/about",show:!0},{id:"_editBtn",type:"special",numeric:!1,show:!0}],table:"company_info",title:"CompanyInfo"},t={header:[{id:"_editBtn",type:"special",numeric:!1,show:!0}],table:"contact",title:"\u30c6\u30b9\u30c8"};return l.a.createElement(we.a,{maxWidth:"lg"},l.a.createElement(Se,e),l.a.createElement(Se,t))})),De=Object(h.e)((function(){var e=Object(n.useState)([]),t=Object(g.a)(e,2),a=t[0],r=t[1],i={header:[{id:"_detailBtn",numeric:!1,disablePadding:!0,label:"",link:"/"},{id:"_checkBox",numeric:!1,disablePadding:!0,label:""},{id:"id",numeric:!0,disablePadding:!0,label:"ID"},{id:"companyName",numeric:!1,disablePadding:!1,label:"companyName"},{id:"companySuffix",numeric:!1,disablePadding:!1,label:"companySuffix"},{id:"companyPrefix",numeric:!1,disablePadding:!1,label:"companyPrefix"}],results:a,title:"customer2"};return Object(n.useEffect)((function(){E.a.get("/api/company_info").then((function(e){return r(e.data)})).catch((function(e){return new Error(e)}))}),[]),l.a.createElement(we.a,{maxWidth:"md"},l.a.createElement(Se,i))})),Ne=Object(h.e)((function(){var e={header:[{id:"_checkBox",type:"special",numeric:!1,label:"",show:!0},{id:"_linkBtn",type:"special",numeric:!1,link:"/",show:!0},{id:"_editBtn",type:"special",numeric:!1,show:!0}],table:"sample_entity",title:"SamplePage"};return l.a.createElement(we.a,{maxWidth:"lg"},l.a.createElement(Se,e))})),xe=a(157),Pe=a(158),Be=a(163),Te=a(162),Ie=function(e){Object(Be.a)(a,e);var t=Object(Te.a)(a);function a(){return Object(xe.a)(this,a),t.apply(this,arguments)}return Object(Pe.a)(a,[{key:"render",value:function(){return l.a.createElement("div",null,l.a.createElement(f.b,{to:"/"},"TopPage"),l.a.createElement(f.b,{to:"/About"},"About"),l.a.createElement(f.b,{to:"/Sample"},"Sample Page"))}}]),a}(l.a.Component),Ye=Object(s.a)({palette:{type:"light",primary:d.a,secondary:p.a}}),_e=function(){return l.a.createElement(o.a,{theme:Ye},l.a.createElement(f.a,null,l.a.createElement(Ie,null),l.a.createElement("hr",null),l.a.createElement(h.a,{exact:!0,path:"/",component:Ce}),l.a.createElement(h.a,{path:"/About",component:De}),l.a.createElement(h.a,{path:"/Sample",component:Ne})))};Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));i.a.render(l.a.createElement(l.a.StrictMode,null,l.a.createElement(_e,null)),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then((function(e){e.unregister()})).catch((function(e){console.error(e.message)}))}},[[178,1,2]]]);
//# sourceMappingURL=main.ceeeff3f.chunk.js.map