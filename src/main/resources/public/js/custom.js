jQuery(document).ready(function() {
    
   "use strict";

   var spinner = jQuery('#spinner,#spinner2').spinner();
   spinner.spinner('value', 0);

   // $('#deleteClientAlert').hide();
   // $('#updateClientForm').hide();
  
   // jQuery('#toggleDeleteClient').click(function(){
   //    $('#deleteClientAlert').show();
   //    $('#updateClientForm').hide();
   // });
   // jQuery('#toggleBackDeleteClient').click(function(){
   //    $('#deleteClientAlert').hide();
   // });

   // jQuery('#toggleUpdateClient').click(function(){
   //    $('#updateClientForm').show();
   //    $('#deleteClientAlert').hide();
   // });
   // jQuery('#toggleBackUpdateClient').click(function(){
   //    $('#updateClientForm').hide();
   // });

   $("form[name='squadForm']").validate({
      rules: {
         squad_name: "required",
         squad_size: {
            required: true,
            number: true
         },
         squad_cause: "required"
      },

      messages: {
         squad_name: "A squad can't be without a name.",
         squad_size: {
            required: "We have to limit the size.",
            number: "Please enter a valid number."
         },
         squad_cause: "What's the MOTIVE?"
      },
      submitHandler: function(form) {
         form.submit();
      }
   });

   $("form[name='heroForm']").validate({
      rules: {
         hero_name: "required",
         hero_age: {
            required: true,
            number: true
         },
         hero_ability: "required",
         hero_weakness: "required",
         hero_squad: "required"
      },

      messages: {
         hero_name: "Has to have a name!",
         hero_age: {
            required: "How Old?",
            number: "Please enter a valid number."
         },
         hero_ability: "Please give your hero an ability.",
         hero_weakness: "C'Mon! He can't be all powerful.",
         hero_squad: "A team up is required."
      },
      submitHandler: function(form) {
         form.submit();
      }
   });
});