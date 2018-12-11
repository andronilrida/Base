package andronil.com.base.annotations;

import andronil.com.base.component.viewModel.MarkerViewModel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface InsertViewModel {

    Class<? extends MarkerViewModel> viewModel();
}
