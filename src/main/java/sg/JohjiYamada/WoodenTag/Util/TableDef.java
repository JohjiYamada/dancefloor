package sg.JohjiYamada.WoodenTag.Util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)

@Target({ 
	ElementType.TYPE
})
public @interface TableDef {
	String caption();
	String description();
	boolean isSystem() default false;
}
