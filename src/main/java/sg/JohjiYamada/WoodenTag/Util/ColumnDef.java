package sg.JohjiYamada.WoodenTag.Util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)

@Target({ 
	ElementType.FIELD
})
public @interface ColumnDef {
	String caption();
	EnumColumnType type();
	int length();
	int columnOrder();
	boolean show() default true;
	boolean required() default false;
	String selectionEnum() default "";
}
