package entity;

import entity.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "zdocController")
@ViewScoped
public class ZdocController extends AbstractController<Zdoc> {

    @Inject
    private MobilePageController mobilePageController;

    public ZdocController() {
        // Inform the Abstract parent controller of the concrete Zdoc Entity
        super(Zdoc.class);
    }

}
