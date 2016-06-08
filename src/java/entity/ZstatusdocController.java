package entity;

import entity.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "zstatusdocController")
@ViewScoped
public class ZstatusdocController extends AbstractController<Zstatusdoc> {

    @Inject
    private MobilePageController mobilePageController;

    public ZstatusdocController() {
        // Inform the Abstract parent controller of the concrete Zstatusdoc Entity
        super(Zstatusdoc.class);
    }

}
