package entity;

import entity.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "zdocLineController")
@ViewScoped
public class ZdocLineController extends AbstractController<ZdocLine> {

    @Inject
    private MobilePageController mobilePageController;

    public ZdocLineController() {
        // Inform the Abstract parent controller of the concrete ZdocLine Entity
        super(ZdocLine.class);
    }

}
