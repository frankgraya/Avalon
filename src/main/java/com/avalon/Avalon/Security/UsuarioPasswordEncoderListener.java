package com.avalon.Avalon.Security;

import com.avalon.Avalon.Model.Security.Usuario;
import org.hibernate.event.spi.PreInsertEvent;
import org.hibernate.event.spi.PreUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioPasswordEncoderListener {
    /*@Autowired
    SpringSecurityService springSecurityService;

    @Listener(Usuario)
    void onPreInsertEvent(PreInsertEvent event) {
        encodePasswordForEvent(event);
    }

    @Listener(Usuario)
    void onPreUpdateEvent(PreUpdateEvent event) {
        encodePasswordForEvent(event);
    }

    private void encodePasswordForEvent(AbstractPersistenceEvent event) {
        if (event.entityObject instanceof Usuario) {
            Usuario u = event.entityObject as Usuario;
            if (u.password && ((event instanceof  PreInsertEvent) || (event instanceof PreUpdateEvent && u.isDirty('password')))) {
                event.getEntityAccess().setProperty('password', encodePassword(u.password));
            }
        }
    }

    private String encodePassword(String password) {
        springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password;
    }*/
}
