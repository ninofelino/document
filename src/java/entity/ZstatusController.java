package entity;

import entity.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "zstatusController")
@ViewScoped
public class ZstatusController extends AbstractController<Zstatus> {

    @Inject
    private MobilePageController mobilePageController;

    public ZstatusController() {
        // Inform the Abstract parent controller of the concrete Zstatus Entity
        super(Zstatus.class);
    }

}
