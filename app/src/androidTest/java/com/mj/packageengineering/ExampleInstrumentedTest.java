�}�y 
 �  ��Z3�"���u
��x�Gw��O/;�-e�wm>�.ܨڪ��D�!�'�L7M��f����fS�P�shKL-��v,_�H}Kq�kY�M"����M�l��x���Kv&C����Ͷ�a�j�� �E}]������򠩝���]��"��Y׉��y�I������q>��ya�`�H�
���-Exj{&k���c��i���ߵ���Ĭ��sL������wI�[r�� ���Df����ρ�簺�~@��{���L�/I÷ݸ�5~� ��j�&Er��<;lX$H>�+%�$N16Ўج���&=�ZA��g�����w�z �͏�^�ra��{5���$o�A��H��q[���H'�>򀵎�WP=�vgAA�/9��]��ܵڋ���l�����Й�o�~��� ����w$Ow �3E4[G��vo�+ �n�R�4���m{�wK`���	b����h�ci��*<��e$�{�N7����Y?�t
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.mj.packageengineering", appContext.getPackageName());
    }
}
