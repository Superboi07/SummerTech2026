module com.summertech20206 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.logging;
    requires java.compiler;
    requires org.fxyz3d.core;
    requires JavaCad;
    requires jcsg;
    requires vvecmath;
    requires javafx.base;
    requires org.json;
    
    opens com.summertech2026 to javafx.fxml;
    exports com.summertech2026;
}
