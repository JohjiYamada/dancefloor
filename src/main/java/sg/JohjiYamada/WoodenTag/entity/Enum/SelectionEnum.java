package sg.JohjiYamada.WoodenTag.entity.Enum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface SelectionEnum<E extends Enum<E>> {

	String getDispName();
	Integer getSelectionValue();

	default int getOrder() {
		return getSelectionValue();
	}

	@SuppressWarnings("unchecked")
	default E toEnum() {
		return (E) this;
	}

	default boolean equalsByValue(Integer selVal) {
		return getSelectionValue().equals(selVal);
	}

	static <E extends Enum<E>> List<E> getOrderedList(Class<? extends SelectionEnum<E>> clazz) {
		return Arrays.stream(clazz.getEnumConstants()).sorted(Comparator.comparing(SelectionEnum::getOrder))
				.map(SelectionEnum::toEnum).collect(Collectors.toList());
	}

	static <E extends Enum<E>> E getEnum(Class<? extends SelectionEnum<E>> clazz, Integer value) {
		return Arrays.stream(clazz.getEnumConstants()).filter(e -> e.equalsByValue(value)).map(SelectionEnum::toEnum)
				.findFirst().orElse(null);
	}

	static <E extends Enum<E>> Map<Integer, E> getMap(Class<? extends SelectionEnum<E>> clazz) {
		return Arrays.stream(clazz.getEnumConstants()).collect(Collectors.toMap(SelectionEnum::getSelectionValue, SelectionEnum::toEnum));
	}

	static <E extends Enum<E>> boolean hasCode(Class<? extends SelectionEnum<E>> clazz, Integer value) {
		return Arrays.stream(clazz.getEnumConstants()).anyMatch(e -> e.equalsByValue(value));
	} 
	
}
