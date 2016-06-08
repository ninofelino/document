package entity;

import entity.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "zuserController")
@ViewScoped
public class ZuserController extends AbstractController<Zuser> {

    @Inject
    private MobilePageController mobilePageController;

    public ZuserController() {
        // Inform the Abstract parent controller of the concrete Zuser Entity
        super(Zuser.class);
    }

}
