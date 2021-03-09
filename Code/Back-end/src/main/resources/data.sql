Insert into Credentials
(
	email,
	password,
	user_type
) values
(
	'harsha@gmail.com',
	'harsha@123',
	'admin'
);	
Insert into Credentials
(
	email,
	password,
	user_type
) values
(
	'harsha.vardhan@gmail.com',
	'harsha@123',
	'user'
);	
Insert into Credentials
(
	email,
	password,
	user_type
) values
(
	'harsha1.vardhan@gmail.com',
	'harsha@123',
	'motivator'
);	

INSERT into User
(
	user_id,
	full_name,
	age,
	gender,
	mobile_number,
	email,
	address,
	city,
	state,
	country,
	pin_code,
	height,
	weight,
	reason_for_joining,
	medical_conditions,
	dietary_ristrictions,
	dietary_custom,
	pregnant_status,
	referral_code,
	bmi,
	approval_status,
	new_user,
	batch_id,
	user_reference_code
) values
(
	'ha1',
	'Harsha vardhan chokkakula',
	22,
	'male',
	8919337550,
	'harsha@gmail.com',
	'kondapur',
	'hyderabad',
	'Telangana',
	'India',
	535161,
	170,
	75,
	'just to be slim',
	'good',
	'none',
	'non-veg',
	'no',
	'ref1',
	25,
	'no',
	'yes',
	' ',
	'REF1HAR'
);
INSERT into User
(
	user_id,
	full_name,
	age,
	gender,
	mobile_number,
	email,
	address,
	city,
	state,
	country,
	pin_code,
	height,
	weight,
	reason_for_joining,
	medical_conditions,
	dietary_ristrictions,
	dietary_custom,
	pregnant_status,
	referral_code,
	bmi,
	approval_status,
	new_user,
	batch_id,
	user_reference_code
) values
(
	'HARSHA1',
	'Harsha chokkakula',
	22,
	'male',
	8919337550,
	'harsha.vardhan@gmail.com',
	'kondapur',
	'hyderabad',
	'Telangana',
	'India',
	535161,
	170,
	75,
	'just to be slim',
	'good',
	'none',
	'non-veg',
	'no',
	'REF1HAR',
	25,
	'no',
	'yes',
	'Batch1',
	'REF2HAR'
);

Insert into Messages
(
	message,
	send_from,
	send_to,
	bu_id
)
values
(
	'Hi this is First Message',
	'Harsha',
	'Vardhan',
	'Batch1'
);

Insert into Measurements values ('harsha.chokkakula@gmail.com',170,75,65,60,'april',40,15,15,30);

Insert into Dailylog values ('harsha.chokkakula@gmail.com','idly','04 06 2020','roti','apple','rice','carrot','pushups,pullups');