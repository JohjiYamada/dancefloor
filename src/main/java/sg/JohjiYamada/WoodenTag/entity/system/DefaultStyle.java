package sg.JohjiYamada.WoodenTag.entity.system;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class DefaultStyle implements Serializable  {
	private static final long serialVersionUID = 1L;
	private String width = "350px";
}
