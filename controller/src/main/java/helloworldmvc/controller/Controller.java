package helloworldmvc.controller;

import helloworldmvc.model.IModel;
import helloworldmvc.view.IView;

public class Controller {
    private final IModel model;
    private final IView view;

    public Controller(IModel model, IView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        String display = this.model.getMessage();
        this.view.display(display);
    }

}
