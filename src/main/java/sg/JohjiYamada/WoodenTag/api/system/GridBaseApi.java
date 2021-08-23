package sg.JohjiYamada.WoodenTag.api.system;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import sg.JohjiYamada.WoodenTag.BootStrap;
import sg.JohjiYamada.WoodenTag.entity.Enum.Selection;
import sg.JohjiYamada.WoodenTag.entity.Enum.SelectionEnum;
import sg.JohjiYamada.WoodenTag.entity.system.GridBase;
import sg.JohjiYamada.WoodenTag.entity.system.HeadCell;
import sg.JohjiYamada.WoodenTag.service.system.SelectionService;

@RestController
@RequestMapping("/api")
public class GridBaseApi {
	
	@Autowired
	private SelectionService selectionService;

	
	@GetMapping("/head_cell/{table}")
	@ResponseStatus(HttpStatus.OK)
	List<HeadCell> findAll(@PathVariable("table") String table){
		List<GridBase> gbList = BootStrap.GRID_BASE_MAP.get(table);
		List<HeadCell> hcList = gbList.stream().map(gb -> {
			return HeadCell.createHeadCell(gb);
		}).collect(Collectors.toList());
		return hcList;
	}

	@GetMapping("/selection/{enumName}")
	@ResponseStatus(HttpStatus.OK)
	Map<String, List<Selection>> findEnum(@PathVariable("enumName") String enumName) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		List<SelectionEnum<? extends SelectionEnum<?>>> enumList = selectionService.getSelectionList(enumName);
		Map<String, List<Selection>> selMap = new HashMap<>();
		selMap.put(enumName, enumList.stream().map(enumSel -> new Selection(enumSel.getDispName(), enumSel.getSelectionValue())).collect(Collectors.toList()));
		return selMap;
	}
	
	
//	headCells: [
//				{ id: '_checkBox', type: "special", numeric: false,  label: '' },
//				{ id: '_linkBtn', type: "special", numeric: false, link: "/about" },
//				{ id: '_editBtn', type: "special", numeric: false },
	
//				{ id: 'id', type: "id", numeric: true,  field: 'id', label: 'ID', style:{width: "350px"} },
//				{ id: 'companyName', type: "String", numeric: false, field: 'companyName', label: '顧客名称' , style:{width: "350px"}},
//				{ id: 'companyPrefix', type: "String", numeric: false, field: 'companyPrefix', label: '会社接頭辞' , style:{width: "350px"}},
//				{ id: 'companySuffix', type: "String", numeric: false, field: 'companySuffix', label: '会社接尾辞' , style:{width: "350px"}},
//			],

	
}
